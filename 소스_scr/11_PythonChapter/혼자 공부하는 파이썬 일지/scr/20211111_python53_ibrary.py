from flask import Flask

app = Flask(__name__)
#export FlASK_APP=python53_ibrary.py

@app.route("/")# 데코레이터
def hello():
    return "hello, World!"

"""
set FLASK_APP=파일 이름.py #(환경)변수를 설정
flask run                   # flask 명령 
"""