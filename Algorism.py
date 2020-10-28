//파이썬

def boling():

    #개수, 중량 입력받기

    N,K = map(int, input().split())

 

    #중량이 K까지인 볼링 개수 입력받은 후 정렬

    E = list(map(int, input().split()))

 

 

    #E 배열을 돌리는 이중 For문 만들기 (선택정렬)

    count = 0

    for i in range(len(E)):

        for j in range(i+1,len(E)):

            if E[i]!=E[j]:

                #print(E[i],E[j])

                count+=1

    

    print(count)

 

for i in range(2):

    boling()
