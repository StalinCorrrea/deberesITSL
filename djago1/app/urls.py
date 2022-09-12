from django.contrib import admin
from django.urls import path
from . import views

urlpatterns =[
       path('', views.home, name='home'),
       path('pagina1', views.pagina1, name='pagina1'),
       path('pagina2', views.pagina2, name='pagina2'),
]