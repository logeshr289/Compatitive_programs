a=list(input())
for i in range(0,len(a)-1,2):
    a[i],a[i+1]=a[i+1],a[i]
print("".join(map(str,a)))


#12345

#21435
