n=int(input())

a=list(map(int,input().split()))
s=sum(a)
n=s%4
if n==0:
    print(s/4)
else:
    print(int(s/4)+1)
    
