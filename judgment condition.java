/**
     * ȡ���ж�����
     */
    private void getCondition() {
        /**
         * �Ը��ſ�ͷ��������������Ǽ���
         * ���磺-21��2
         */
        startWithOperator = existedText.startsWith("-") && ( existedText.contains("+") ||
                existedText.contains("��") || existedText.contains("��") );
        /**
         * �Ը��ſ�ͷ����������Ǽ���
         * ���磺-21-2
         */
        startWithSubtract = existedText.startsWith("-") && ( existedText.lastIndexOf("-") != 0 );
        /**
         * ���Ը��ſ�ͷ���Ұ��������
         * ���磺21-2
         */
        noStartWithOperator = !existedText.startsWith("-") && ( existedText.contains("+") ||
                existedText.contains("-") || existedText.contains("��") || existedText.contains("��"));
    }
