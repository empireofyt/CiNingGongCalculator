/**
             * �����
             */
            case R.id.plus_btn:
                /**
                 * �ж����е��ַ��Ƿ��ǿ�ѧ����
                 * �� ����
                 * �� ������һ��
                 *
                 * �жϱ��ʽ�Ƿ���Խ��м���
                 * �� �ȼ���������ַ�
                 * �� ����ַ�
                 *
                 * �жϼ������ַ��Ƿ��� error
                 * �� ����
                 * �� ��������
                 */
                if (!existedText.contains("e")) {

                    if (judgeExpression()) {
                        existedText = getResult();
                        if (existedText.equals("error")){

                        } else {
                            existedText += "+";
                        }
                    } else {

                        if (isCounted) {
                            isCounted = false;
                        }

                        if ((existedText.substring(existedText.length() - 1)).equals("-")) {
                            existedText = existedText.replace("-", "+");
                        } else if ((existedText.substring(existedText.length() - 1)).equals("��")) {
                            existedText = existedText.replace("��", "+");
                        } else if ((existedText.substring(existedText.length() - 1)).equals("��")) {
                            existedText = existedText.replace("��", "+");
                        } else if (!(existedText.substring(existedText.length() - 1)).equals("+")) {
                            existedText += "+";
                        }
                    }
                } else {
                    existedText = "0";
                }
break;
           

