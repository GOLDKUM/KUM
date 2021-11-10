# 재귀함수로 만들어서 리스트를 평탄화하는 함수
#리스트 평탄화는 중첩된 리스트가 있을 떄 중첩을 모두 제거하고 풀어서 1차원 리스트로 만드는 것을
#의미합니다. 다음 실행결과를 참고해주세요.

#원본[[1,2,3],[4,[5,6]],7,[8,9]]
#변환[1,2,3,4,5,6,7,8,9]
example=[[1,2,3],[4,[5,6]],7,[8,9]]
def flatten(data):
    output=[]
    for item in data:
        if type(item)==list:
            output += flatten(item)
        else:
            #output.append(item)
            output+=[item]
    return output
print("원본",example)
print("변환",flatten(example))

