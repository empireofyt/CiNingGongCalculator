  /**
             * ������ݳ��ȴ��ڵ���10λ�����п�ѧ����
             *
             * �����С���㣬���ж�С����ǰ�Ƿ���ʮ�����֣�������п�ѧ����
             */
            if (tempResult.length() >= 10) {
                tempResult = String.format("%e", Double.parseDouble(tempResult));
            } else if (tempResult.contains(".")) {
                if (tempResult.substring(0, tempResult.indexOf(".")).length() >= 10) {
                    tempResult = String.format("%e", Double.parseDouble(tempResult));
                }
            }
        } else {
            tempResult = existedText;
        }

        return tempResult;
    }