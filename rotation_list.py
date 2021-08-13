input()
l=list(map(int,input().split()))
b=int(input())
b=b%len(l) if b>len(l) else b
l= l[-b:] + l[:-b] 
print(l)



#1

#1 2 3 4 5

#3
#[3, 4, 5, 1, 2]
