import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.QQCustomDialog;

public class smj
  extends BaseAdapter
{
  public smj(QQCustomDialog paramQQCustomDialog)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int getCount()
  {
    if (a.items != null) {
      return a.items.length;
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (a.inflater == null) {
      a.inflater = ((LayoutInflater)a.getContext().getSystemService("layout_inflater"));
    }
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = a.inflater.inflate(a.getDialogListItemLayout(), null);
      paramView = new sms(a, null);
      a = ((TextView)paramViewGroup.findViewById(2131297749));
      paramViewGroup.setTag(paramView);
    }
    paramView = (sms)paramViewGroup.getTag();
    int i;
    int j;
    int k;
    int m;
    if (a != null)
    {
      a.setText(a.items[paramInt]);
      a.setOnClickListener(new smr(a, paramInt));
      i = a.getPaddingTop();
      j = a.getPaddingLeft();
      k = a.getPaddingRight();
      m = a.getPaddingBottom();
      if (a.items.length != 1) {
        break label212;
      }
      a.setBackgroundResource(2130838290);
    }
    for (;;)
    {
      a.setPadding(j, i, k, m);
      return paramViewGroup;
      label212:
      if (paramInt == 0) {
        a.setBackgroundResource(2130838291);
      } else if (paramInt == a.items.length - 1) {
        a.setBackgroundResource(2130838289);
      }
    }
  }
}