#unit digit


n,m=map(int,input().split())
c=0
for i in range(n,m+1):
    if(len(set(str(i)))==len(str(i))):
        c=c+1 
print(c)


#11 15 
#answer=  4   
#(12 13 14 15)
