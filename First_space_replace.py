import re

string = 'abc 12\
de 23 \n f45 6'

pattern = '\s+'
replace = ''

new_string = re.sub(r'\s+', replace, string, 1) 
print(new_string)


#First space replace
#abc12de 23 
# f45 6
