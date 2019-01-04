package com.example.yt.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class initbutton extends ActionBarActivity {

    /**
     * 数字
     */
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    /**
     * 运算符
     */
    private Button plus_btn;
    private Button subtract_btn;
    private Button multiply_btn;
    private Button divide_btn;
    private Button equal_btn;
    /**
     * 其他
     */
    private Button dot_btn;
    private Button percent_btn;
    private Button delete_btn;
    private Button ac_btn;
    /**
     * 结果
     */
    private EditText mResultText;
    /**
     * 已经输入的字符
     */
    private String existedText = "";
    /**
     * 是否计算过
     */
    private boolean isCounted = false;
    /**
     * 以负号开头，且运算符不是是减号
     * 例如：-21×2
     */
    private boolean startWithOperator = false;
    /**
     * 以负号开头，且运算符是减号
     * 例如：-21-2
     */
    private boolean startWithSubtract = false;
    /**
     * 不以负号开头，且包含运算符
     * 例如：21-2
     */
    private boolean noStartWithOperator = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initbutton);
    }
}
