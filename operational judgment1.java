/**
         * ���������������������
         * û�������������Ѿ����ڵ������ٴ���ȥ
         */
        if ( startWithOperator || noStartWithOperator || startWithSubtract) {

            if (existedText.contains("+")) {
                /**
                 * �Ȼ�ȡ��������
                 */
                param1 = existedText.substring(0, existedText.indexOf("+"));
                param2 = existedText.substring(existedText.indexOf("+") + 1);
                /**
                 * ����ڶ�������Ϊ�գ�������ʾ��ǰ�ַ�
                 */
                if (param2.equals("")){
                    tempResult = existedText;
                } else {
                    /**
                     * ת��StringΪDouble
                     * �������ת����String����
                     * ����������ʽ����
                     */
                    arg1 = Double.parseDouble(param1);
                    arg2 = Double.parseDouble(param2);
                    result = arg1 + arg2;
                    tempResult = String.format("%f", result);
                    tempResult = subZeroAndDot(tempResult);
                }


            } else if (existedText.contains("��")) {

                param1 = existedText.substring(0, existedText.indexOf("��"));
                param2 = existedText.substring(existedText.indexOf("��") + 1);

                if (param2.equals("")){
                    tempResult = existedText;
                } else {
                    arg1 = Double.parseDouble(param1);
                    arg2 = Double.parseDouble(param2);
                    result = arg1 * arg2;
                    tempResult = String.format("%f", result);
                    tempResult = subZeroAndDot(tempResult);
                }

            } else if (existedText.contains("��")) {

                param1 = existedText.substring(0, existedText.indexOf("��"));
                param2 = existedText.substring(existedText.indexOf("��") + 1);

                if (param2.equals("0")){
                    tempResult = "error";
                } else if (param2.equals("")){
                    tempResult = existedText;
                } else {
                    arg1 = Double.parseDouble(param1);
                    arg2 = Double.parseDouble(param2);
                    result = arg1 / arg2;
                    tempResult = String.format("%f", result);
                    tempResult = subZeroAndDot(tempResult);
                }

            } else if (existedText.contains("-")) {

                /**
                 * �����������һ�� - ��Ϊ�ָ�ȥȡ����������
                 * ��������������������������㹫ʽ
                 * ���ֱ����˵�һ�������Ǹ��������
                 */
                param1 = existedText.substring(0, existedText.lastIndexOf("-"));
                param2 = existedText.substring(existedText.lastIndexOf("-") + 1);

                if (param2.equals("")){
                    tempResult = existedText;
                } else {
                    arg1 = Double.parseDouble(param1);
                    arg2 = Double.parseDouble(param2);
                    result = arg1 - arg2;
                    tempResult = String.format("%f", result);
                    tempResult = subZeroAndDot(tempResult);
                }

            }
           