package com.tencent.mobileqq.msf.core;

import com.tencent.mobileqq.msf.core.a.a;
import com.tencent.mobileqq.msf.core.b.c;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;

final class k
  extends Thread
{
  k() {}
  
  public void run()
  {
    int k = 3;
    Object localObject = new File(QLog.getLogPath());
    Calendar localCalendar;
    int i;
    if (((File)localObject).exists())
    {
      localObject = ((File)localObject).listFiles();
      if ((localObject == null) || (localObject.length == 0)) {
        return;
      }
      Arrays.sort((Object[])localObject, new l(this));
      localCalendar = Calendar.getInstance();
      try
      {
        String str = a.g();
        if ((str == null) || (str.length() <= 0)) {
          break label237;
        }
        i = Integer.parseInt(str);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
          i = 3;
        }
      }
      j = k;
      if (i >= 1) {
        if (i <= 14) {
          break label305;
        }
      }
    }
    label237:
    label305:
    for (int j = k;; j = i)
    {
      localCalendar.add(6, j - j * 2);
      long l = localCalendar.getTimeInMillis();
      j = localObject.length;
      i = 0;
      while (i < j)
      {
        localCalendar = localObject[i];
        if (QLog.isColorLevel()) {
          QLog.d(f.a, 2, "found log file " + localCalendar.getName());
        }
        if (l > localCalendar.lastModified())
        {
          localCalendar.delete();
          if (QLog.isColorLevel()) {
            QLog.d(f.a, 2, "del expires log " + localCalendar.getName());
          }
        }
        i += 1;
      }
      localObject = Calendar.getInstance();
      ((Calendar)localObject).set(6, ((Calendar)localObject).get(6) - 7);
      ((Calendar)localObject).set(11, 0);
      ((Calendar)localObject).set(12, 0);
      ((Calendar)localObject).set(13, 0);
      ((Calendar)localObject).set(14, 0);
      c.b(((Calendar)localObject).getTimeInMillis());
      return;
    }
  }
}