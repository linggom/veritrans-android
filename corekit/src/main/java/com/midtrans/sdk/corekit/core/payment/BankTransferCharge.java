package com.midtrans.sdk.corekit.core.payment;

import com.midtrans.sdk.corekit.base.callback.MidtransCallback;
import com.midtrans.sdk.corekit.core.api.snap.model.pay.response.BcaBankTransferReponse;
import com.midtrans.sdk.corekit.core.api.snap.model.pay.response.BniBankTransferResponse;
import com.midtrans.sdk.corekit.core.api.snap.model.pay.response.MandiriBillResponse;
import com.midtrans.sdk.corekit.core.api.snap.model.pay.response.PermataBankTransferResponse;

import okhttp3.ResponseBody;

public class BankTransferCharge extends BaseGroupPayment {

    /**
     * Start payment using bank transfer and va with BCA.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param fullName  Fullname, this is nullable.
     * @param phone     phone, this is nullable.
     * @param email     email, this is nullable.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBankTransferVaBca(final String snapToken,
                                                     String fullName,
                                                     String phone,
                                                     String email,
                                                     final MidtransCallback<BcaBankTransferReponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBankTransferVaBca(snapToken, fullName, phone, email, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with BNI.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param fullName  Fullname, this is nullable.
     * @param phone     phone, this is nullable.
     * @param email     email, this is nullable.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBankTransferVaBni(final String snapToken,
                                                     String fullName,
                                                     String phone,
                                                     String email,
                                                     final MidtransCallback<BniBankTransferResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBankTransferVaBni(snapToken, fullName, phone, email, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with PERMATA.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param fullName  Fullname, this is nullable.
     * @param phone     phone, this is nullable.
     * @param email     email, this is nullable.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBankTransferVaPermata(final String snapToken,
                                                         String fullName,
                                                         String phone,
                                                         String email,
                                                         final MidtransCallback<PermataBankTransferResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBankTransferVaPermata(snapToken, fullName, phone, email, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with Other Bank.
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param fullName  Fullname, this is nullable.
     * @param phone     phone, this is nullable.
     * @param email     email, this is nullable.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBankTransferVaOther(final String snapToken,
                                                       String fullName,
                                                       String phone,
                                                       String email,
                                                       final MidtransCallback<ResponseBody> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBankTransferVaOther(snapToken, fullName, phone, email, callback);
        }
    }

    /**
     * Start payment using bank transfer and va with Mandiri.
     * Mandiri Bill = Mandiri Echannel = VA Mandiri
     *
     * @param snapToken token after making checkoutWithTransaction.
     * @param fullName  Fullname, this is nullable.
     * @param phone     phone, this is nullable.
     * @param email     email, this is nullable.
     * @param callback  for receiving callback from request.
     */
    public static void paymentUsingBankTransferVaMandiriBill(final String snapToken,
                                                             String fullName,
                                                             String phone,
                                                             String email,
                                                             final MidtransCallback<MandiriBillResponse> callback) {
        if (isValidForNetworkCall(callback)) {
            getSnapApiManager().paymentUsingBankTransferVaMandiriBill(snapToken, fullName, phone, email, callback);
        }
    }
}