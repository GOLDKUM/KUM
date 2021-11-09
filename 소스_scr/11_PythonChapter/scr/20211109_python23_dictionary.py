리스트 =[]
리스트 =[1,2,3,4,5]
리스트[0]#인덱스

딕셔너리={
    "키A":"값A",
    "키B":"값B",
    "키C":"값C",
    "문자열":"값",
    273:[1,2,3,4],
    True:False
}

print(딕셔너리["키A"])
print(딕셔너리["키B"])
print(딕셔너리["키C"])
딕셔너리["문자열"]='값값값'
print(딕셔너리)

for key in 딕셔너리:
    print("{}:{}".format(key,딕셔너리[key]))

딕셔너리["추가"]='값'
for key in 딕셔너리:
    print("{}:{}".format(key,딕셔너리[key]))

del 딕셔너리['추가']
for key in 딕셔너리:
    print("{}:{}".format(key,딕셔너리[key]))