import datetime

t1 = datetime.datetime.now()
result = 0
result += sum(range(1,1000000))

print("value:", result, "\ntime", (datetime.datetime.now() - t1).total_seconds(),"seconds")
