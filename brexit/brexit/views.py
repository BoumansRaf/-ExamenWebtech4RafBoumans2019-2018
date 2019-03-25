# -*- coding: utf-8 -*-
from __future__ import unicode_literals
from django.http import HttpResponse
from django.shortcuts import render

import os.path
from dateutil.relativedelta import relativedelta
import datetime


def brexit(request):
    today = datetime.datetime.now()
    
    rd = relativedelta(datetime.datetime(2019,3,29,23), today)
    s = 'Days:' + str(rd.days) + ' hours: ' + str(rd.hours) + ' Minutes: ' + str(rd.minutes) + ' seconds: ' + str(rd.seconds)

    return HttpResponse(s)


