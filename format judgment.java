
   
/**
     * ���ж��Ƿ񰴹����ں�
     * �� ����������ʾ��ǰ����
     * �� �����еı��ʽ������ַ�
     *
     * �ж������Ƿ����һ�� 0
     * �� ���ַ�������Ϊ���ַ�����
     *   1���򿪽���û���������ʱ��AC�������ɾ��������ʱ�򣬻���ʾһ�� 0
     *   2���������� 0 ��ʱ�����óɿ��ַ������ٰ� 0 �����ֻỹ�� 0����Ȼ���԰��� 000 ��������
     * �� ��Ӱ��µļ����ַ�
     *
     * �ж������Ƿ����С����
     * �� ���ֲ��ܳ���ʮλ
     * �� ���ֲ��ܳ�����λ
     *
     * ����������жϺ����ж������Ƿ񳬹���������
     * ���������κβ���
     * û����������������
     */
    private String isOverRange(String existedText, String s) {
        /**
         * �ж��Ƿ�����
         */
        if (!isCounted){
            /**
             * �ж��Ƿ��ǿ�ѧ����
             * �� �ı�����
             */
            if (existedText.contains("e")){
                existedText = "0";
            }
            /**
             * �ж��Ƿ�ֻ��һ�� 0
             * �� �ı����
             */
            if (existedText.equals("0")){
                existedText = "";
            }
            /**
             * �ж��Ƿ��������
             * �� �жϵڶ�������
             * �� �ж������ַ���
             */
            if (existedText.contains("+") || existedText.contains("-") ||
                    existedText.contains("��") || existedText.contains("��")){
                /**
                 * ���������ʱ �������� �жϵڶ�������
                 * ��������
                 */
                String param2 = null;
                if (existedText.contains("+")){
                    param2 = existedText.substring(existedText.indexOf("+")+1);
                } else if (existedText.contains("-")){
                    param2 = existedText.substring(existedText.indexOf("-")+1);
                } else if (existedText.contains("��")){
                    param2 = existedText.substring(existedText.indexOf("��")+1);
                } else if (existedText.contains("��")){
                    param2 = existedText.substring(existedText.indexOf("��")+1);
                }

//            Log.d("Anonymous param1",param1);
//            Log.d("Anonymous param2",param2);
             if (existedText.substring(existedText.length()-1).equals("+") ||
                        existedText.substring(existedText.length()-1).equals("-") ||
                        existedText.substring(existedText.length()-1).equals("��") ||
                        existedText.substring(existedText.length()-1).equals("��")){
                    existedText += s;
                } else {
                    if (param2.contains(".")){
                        if (param2.length() >= 10){

                        } else {
                            existedText += s;
                        }
                    } else {
                        if (param2.length() >= 9){

                        } else {
                            existedText += s;
                        }
                    }
                }
            } else {
                /**
                 * �����������ʱ һ������
                 */
                if (existedText.contains(".")){
                    if (existedText.length() >= 10){

                    } else {
                        existedText += s;
                    }
                } else {
                    if (existedText.length() >= 9){

                    } else {
                        existedText += s;
                    }
                }
            }

            isCounted = false;

        } else {

            existedText = s;
            isCounted = false;

        } 


        return existedText;
    }
   


        return existedText;
    }
