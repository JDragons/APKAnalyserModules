package com.tencent.mobileqq.msf.core.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.msf.core.MsfCore;
import com.tencent.mobileqq.msf.service.MsfService;
import com.tencent.qphone.base.util.QLog;

final class e
  extends BroadcastReceiver
{
  e() {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (paramContext == null) {
      QLog.d("MSF.C.PushManager:PushCoder", 1, "onReceive action null");
    }
    while (!paramContext.equals("com.tencent.mobileqq.msf.WatchdogForInfoLogin")) {
      return;
    }
    getCorepushManager.i.b();
  }
}