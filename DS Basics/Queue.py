## Initialize a new deque
from collections import deque


queue = deque()
# Add 2 to the end of the deque
queue.append(2)
# Add 4 to the front of the deque
queue.appendleft(4)
# Look at the end of the deque and print it
print(queue[-1])
# Look at the front of the deque and print it
print(queue[0])
# Remove the end of the deque
queue.pop()
# Remove the front of the deque
queue.popleft()



#Example
queue.append(2)