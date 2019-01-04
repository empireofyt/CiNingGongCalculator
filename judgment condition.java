/**
     * 取得判断条件
     */
    private void getCondition() {
        /**
         * 以负号开头，且运算符不是是减号
         * 例如：-21×2
         */
        startWithOperator = existedText.startsWith("-") && ( existedText.contains("+") ||
                existedText.contains("×") || existedText.contains("÷") );
        /**
         * 以负号开头，且运算符是减号
         * 例如：-21-2
         */
        startWithSubtract = existedText.startsWith("-") && ( existedText.lastIndexOf("-") != 0 );
        /**
         * 不以负号开头，且包含运算符
         * 例如：21-2
         */
        noStartWithOperator = !existedText.startsWith("-") && ( existedText.contains("+") ||
                existedText.contains("-") || existedText.contains("×") || existedText.contains("÷"));
    }
