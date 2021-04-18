from django.urls import path
import wordcnt.views

app_name = "wordcnt"

urlpatterns = [
    path('', wordcnt.views.wordinput, name="wordinput"),
    path('result/', wordcnt.views.result, name="result"),
    path('about/', wordcnt.views.about, name="about")
]