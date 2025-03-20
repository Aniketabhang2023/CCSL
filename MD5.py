import hashlib 
str = "aniket"
result = hashlib.md5(str.encode())
print("The MD5 is equivalent to : ", end=" ") 
print(result.hexdigest())
