/**
                 * �ַ������ȴ��� 0 ʱ�Ž�ȡ�ַ���
                 * �������Ϊ 1����ֱ�Ӱ��ַ�������Ϊ 0
                 */
                if (existedText.equals("error")){
                    existedText = "0";
                } else if (existedText.length() > 0){
                    if (existedText.length() == 1) {
                        existedText = "0";
                    } else {
                        existedText = existedText.substring(0,existedText.length()-1);
                    }
                }
                break;
            case R.id.ac_btn:
                existedText = "0";
                break;
        }
        /**
         * ������ʾ
         */
        mResultText.setText(existedText);
   