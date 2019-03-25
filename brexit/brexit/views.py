# -*- coding: utf-8 -*-
from __future__ import unicode_literals
from django.http import HttpResponse
from django.shortcuts import render

import os.path
from dateutil.relativedelta import relativedelta
import datetime

def brexit(request):
    today = datetime.datetime.now
    rd = relativedelta(today,datetime.datetime(2019,3,29,23))
    s = rd.seconds

    return HttpResponse(s)


