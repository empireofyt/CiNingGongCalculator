/**
                 * �ж������Ƿ��������
                 * �� �����κβ���
                 * �� ������һ��
                 *
                 * �ж������Ƿ��� 0
                 * �� �����κβ���
                 * �� ���г���
                 *
                 * ���ַ���ת����double���ͣ������������ת����String��
                 */
                if (existedText.equals("error")){

                } else {

                    getCondition();

                    if (startWithOperator || startWithSubtract || noStartWithOperator) {

                    } else {
                        if (existedText.equals("0")) {
                            return;
                        } else {
                            double temp = Double.parseDouble(existedText);
                            temp = temp / 100;
                            existedText = String.valueOf(temp);
                        }
                    }
                }
                break;
            case R.id.delete_btn:
