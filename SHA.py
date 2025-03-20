import hashlib 
str = "aniket"
result = hashlib.sha256(str.encode())
print("The SHA is equivalent to : ", end=" ") 
print(result.hexdigest())
