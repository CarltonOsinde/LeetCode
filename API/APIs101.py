from pycoingecko import CoinGeckoAPI
import pandas as pd
import plotly as plt
import plotly.graph_objects as go
from matplotlib.pyplot import fignum_exists

#Client Object ~ This creates a known "messager" for the Web service to grant us access to apply the API library functions to
cg = CoinGeckoAPI () 

#Uses the API function to retrieve Bitcoin data from the past 30 days
bitcoin_data = cg.get_coin_market_chart_by_id(id='bitcoin', vs_currency= 'usd', days=30)

raw_data = (bitcoin_data['prices'])

#Creates a data frame from the price JSON data and puts in a DataFrame
data = pd.DataFrame(raw_data, columns= ['Timestamp', 'Price'])

#Converts the Timestamp data to a human readable format
data['Date'] = pd.to_datetime(data['Timestamp'], unit ='ms')


#PLOT the data using CandeleSticks

candlestick_data = data.groupby(data.Date.dt.date).agg({'Price': ['min', 'max', 'first','last']})

fig = go.Figure(data=[go.Candlestick(x = candlestick_data.index,open=candlestick_data['Price']['first'],high=candlestick_data['Price']['max'],low=candlestick_data['Price']['min'], close=candlestick_data['Price']['last'])])

fig.update_layout(xaxis_title='Date',yaxis_title='Price (USD $', title='Bitcoin Candlestick Chart Over Past 30 Days')

plt.plot(fig)