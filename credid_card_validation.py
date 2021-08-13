import re
for i in range(int(input())):
    S = input().strip()
    p= re.search(r'^[456]\d{3}(-?)\d{4}(-?)\d{4}(-?)\d{4}$',S)
    if p:
      s= "".join(p.group(0).split('-'))
      f= re.search(r'(\d)\1{3,}',s)
      print ('Invalid' if f else 'Valid')
    else:
        print ('Invalid')

#credid card validation

#2

#5689 2365 4897 5698 3658
#Invalid

#4536-5689-6598-7458
#Valid
