from django.shortcuts import render
from django.http import HttpResponse
from ast import Return

# Create your views here.

def home (request):
    return render(request, 'index.html')
def pagina1 (request):
    return render(request, 'pagina1.html')
def pagina2 (request):
    return render(request, 'pagina2.html')
