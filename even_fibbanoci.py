
n=int(input())

f6=2
f3=8
if (n==1):
    print(f6)
elif n==2:
    print(f3)
else:
    res=0
    for i in range(2,n):
        res=(f3*4)+f6
        f6=f3
        f3=res
    print(res)
    
    
#144 
