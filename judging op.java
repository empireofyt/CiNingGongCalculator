case R.id.dot_btn:
                /**
                 * �ж��Ƿ������
                 * ��
                 *   �ж��Ƿ������������ �ж������֮������֣��� �ж���������
                 *   �ж������Ƿ���������������С���㣬����������
                 *   �ж��Ѿ����ڵ��������Ƿ���С����
                 * ��
                 *   �ַ�����Ϊ 0.
                 */
                if (!isCounted){

                    if (existedText.contains("+") || existedText.contains("-") ||
                            existedText.contains("��") || existedText.contains("��") ){

                        String param1 = null;
                        String param2 = null;

                        if (existedText.contains("+")) {
                            param1 = existedText.substring(0, existedText.indexOf("+"));
                            param2 = existedText.substring(existedText.indexOf("+") + 1);
                        } else if (existedText.contains("-")) {
                            param1 = existedText.substring(0, existedText.indexOf("-"));
                            param2 = existedText.substring(existedText.indexOf("-") + 1);
                        } else if (existedText.contains("��")) {
                            param1 = existedText.substring(0, existedText.indexOf("��"));
                            param2 = existedText.substring(existedText.indexOf("��") + 1);
                        } else if (existedText.contains("��")) {
                            param1 = existedText.substring(0, existedText.indexOf("��"));
                            param2 = existedText.substring(existedText.indexOf("��") + 1);
                        }
                        Log.d("Anonymous param1",param1);
                        Log.d("Anonymous param2",param2);

                        boolean isContainedDot = param2.contains(".");
                        if (param2.length() >= 9){

                        } else if (!isContainedDot){
                            if (param2.equals("")){
                                existedText += "0.";
                            } else {
                                existedText += ".";
                            }
                        } else {
                            return;
                        }
                    } else {
                        boolean isContainedDot = existedText.contains(".");
                        if (existedText.length() >= 9){

                        } else if (!isContainedDot){
                            existedText += ".";
                        } else {
                            return;
                        }
                    }
                    isCounted = false;

                } else {
                    existedText = "0.";
                    isCounted = false;
                }


                break;
            case R.id.percent_btn: