

def insert_sort(arr):

    unsorted_sublist = range(1,len(arr))

    for i in unsorted_sublist:

        value_to_sort = arr[i]

        while i>0 and arr[i-1] > value_to_sort: #The item to the left (in the sorted list) is greater than the value we are looking to sort(in the unsorted list)
            arr[i-1], arr[i] = arr[i],arr[i-1]  #SWAP Position if the left item is greater than the right item
            i -= 1                              #iterate through the remaining elements in the unsorted sublist

    return arr


print(insert_sort([5,3,4,7]))






































