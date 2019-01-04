  /**
             * 如果数据长度大于等于10位，进行科学计数
             * 如果有小数点，再判断小数点前是否有十个数字，有则进行科学计数
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
