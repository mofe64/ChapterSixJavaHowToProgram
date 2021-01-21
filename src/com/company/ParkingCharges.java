package com.company;

public class ParkingCharges {
    private double baseFee = 2.00;
    private double extraFee = 0.50;
    private double maxCharge = 10.00;

    public double calculateCharge(int hours) {
        double fee = 0.0;
        if (hours <= 3) {
            fee = hours * baseFee;

        }
        if (hours > 3 && hours < 24) {
            double paymentBeforeThreeHourThreshold = 3 * baseFee;
            double paymentAfterThreeHourThreshold = 0.0;
            int excessHours = hours - 3;
            double recalculatedFee = 2.0;
            int feeMultiplier = 1;
            for (int i = 0; i < excessHours; i++) {
                recalculatedFee = baseFee + (extraFee * feeMultiplier);
                feeMultiplier++;
                paymentAfterThreeHourThreshold += (recalculatedFee);
            }
            return paymentBeforeThreeHourThreshold + paymentAfterThreeHourThreshold;
        }
        if (hours >= 24) {
            fee = maxCharge;

        }
        return fee;
    }

}
