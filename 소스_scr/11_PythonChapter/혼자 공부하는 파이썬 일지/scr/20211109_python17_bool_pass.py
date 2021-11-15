#bool(?)
# None
# 0+0.0= False
# 빈컨테이너 ("",b"",[],(),{})=False
print(bool(0))
print(bool(""))
print(bool(b""))
print(bool([]))
print(bool({}))
print(bool(()))

#pass 골격 구조 
number = 0 # 나중에
if number !=0:
    pass
else:
    pass