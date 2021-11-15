# 외부 모듈 설치
#pip install 모듈이름
#pip install 모듈이름 ==1.0.0

html_doc="""
<html>
    <head>
        <title>TEST PAGE</title>
    </head>
    <body>
        <h1>HELLO WORLD</h1>
    </body>
</html>
"""
from bs4 import BeautifulSoup
soup = BeautifulSoup(html_doc, 'html.parser')
print(soup.select("h1"))

from urllib import request
from bs4 import BeautifulSoup
content=request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109")
soup = BeautifulSoup(content,'html.parser')
for data in soup.select("data"):
    print(data.select_one("tmef"))
    print(data.select_one("wf"))
    print('-'*20)
#print(soup.select("data"))

