import re

string = 'hello 12 hi 89. Howdy 34'
pattern = '\d+f'

result = re.findall(pattern, string) 
print(result)


#Find_all
