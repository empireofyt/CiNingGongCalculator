/**
     * �жϱ��ʽ
     *
     * Ϊ�˰��Ⱥ��Ƿ��������
     * �Լ������������������һ���������Ϊ�����ķ��Ų��ƣ��Ƚ�����������������
     */
    private boolean judgeExpression() {

        getCondition();

        String tempParam2 = null;

        if ( startWithOperator || noStartWithOperator || startWithSubtract) {

            if (existedText.contains("+")) {
                /**
                 * �Ȼ�ȡ�ڶ�������
                 */
                tempParam2 = existedText.substring(existedText.indexOf("+") + 1);
                /**
                 * ����ڶ�������Ϊ�գ����ʽ������
                 */
                if (tempParam2.equals("")) {
                    return false;
                } else {
                    return true;
                }
            } else if (existedText.contains("��")) {

                tempParam2 = existedText.substring(existedText.indexOf("��") + 1);

                if (tempParam2.equals("")) {
                    return false;
                } else {
                    return true;
                }

            } else if (existedText.contains("��")) {

                tempParam2 = existedText.substring(existedText.indexOf("��") + 1);

                if (tempParam2.equals("")) {
                    return false;
                } else {
                    return true;
                }

            } else if (existedText.contains("-")) {

                /**
                 * �����������һ�� - ��Ϊ�ָ�ȥȡ����������
                 * ��������������������������㹫ʽ
                 * ���ֱ����˵�һ�������Ǹ��������
                 */
                tempParam2 = existedText.substring(existedText.lastIndexOf("-") + 1);

                if (tempParam2.equals("")) {
                    return false;
                } else {
                    return true;
                }

            }
        }
        return false;
    }
