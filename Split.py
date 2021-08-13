import re

string = 'Twelve:12 Eighty nine:89.'
pattern = '\d+'

result = re.split(pattern, string) 
print(result)


#split by number
#['Twelve:', ' Eighty nine:', '.']
