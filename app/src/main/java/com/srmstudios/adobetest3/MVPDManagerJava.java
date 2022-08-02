package com.srmstudios.adobetest3;

import android.content.Context;
import android.util.Log;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.api.callback.model.AdvancedStatus;
import com.adobe.adobepass.accessenabler.models.Event;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import java.util.ArrayList;


public class MVPDManagerJava {
    private String TAG = "AdobeSDK";
    private AccessEnabler accessEnabler;

    MVPDManagerJava(Context context) {
        accessEnabler =
                AccessEnabler.Factory.getInstance(
                        context,
                        "sp.auth-staging.adobe.com",
                        "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJkM2Y4NmVjMi0wNWIxLTRhM2ItYjQzMi1jNjU5NWViNDFhMzQiLCJuYmYiOjE2NTkxMTAxNzIsImlzcyI6ImF1dGguYWRvYmUuY29tIiwiaWF0IjoxNjU5MTEwMTcyfQ.N_GNU2Jwxt9LWrk7UMnV9c13EAxDsD0hldGxCq1sfWQNxM9DXmEztnD8o3toQr06HpVX3w9baxac6VIdHziaao_bKR7PaWEpIzR9nNSEXfF8Lh3i7klzPrqXg45Cp-wh-v9Vi4ZaHVGf6j1zmw86sonTQ_fqlZN05JtfuwIzpE6ticxibwpazw_fTYAyK-d_LscxDgQj0CoQ7zKwofHvbxSoGroGjTz5FPRfjtgOQ6RZhvkM_oZ7BTwhYXCmezqRWK954EefgzUXWn4WlQ7MlczOKKPeoCBne5_Yybk4BvPjtDSj1uf4zwGyRriOpJ2pKVEI2YIbvgK3q38g6YUWDA",
                        // "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJkM2Y4NmVjMi0wNWIxLTRhM2ItYjQzMi1jNjU5NWViNDFhMzQiLCJuYmYiOjE2NTkxMTAzNjMsImlzcyI6ImF1dGguYWRvYmUuY29tIiwiaWF0IjoxNjU5MTEwMzYzfQ.e2125zMjdYMC-0HuQ4bTWS_RpKJt4dHL2BkknbnGHjRprC8Bue6mliOOrazmnZzuvqQfSIU704r57uUH2jaAsLbgz3G2wWUXDHy7jL3t9daIC2W0rwvPTRfSwuGA9gExeBfFX2R1bhTjTTYSYQYLUa3Ik1Arn19dqDN_0FdDNqa5dsCa3MkZ0JK0VyhO4CWC0biVqLqMbQtMGU6CD1C_sugVn9OdE9mBwmhCf6R-35WRmgKWvKa2y3ZSRPC9ywO_QfXkoeQzvHg4c5O2ZVY7w_BDQ4bq8Ku_-BkkPZcrk2GHyZFhs8RC3EjlPCQsunGaxUc-jzicqXsNGEY438bZAQ",
                        "adobetest3.com"
                );


        setAcccessEnablerDelegate();
    }

    public void setRequester() {
        ArrayList<String> urls = new ArrayList<>();
        urls.add("sp.auth-staging.adobe.com");
        accessEnabler.setRequestor("fs2go", urls);
        Log.d(TAG, "setRequester() called");
    }

    public IAccessEnablerDelegate getAcccessEnablerDelegate() {
        return accessEnabler.getDelegate();
    }

    public void setAcccessEnablerDelegate() {
        accessEnabler.setDelegate(new IAccessEnablerDelegate() {
            @Override
            public void setRequestorComplete(int i) {
                Log.d(TAG, "setRequestorComplete() called with " + i);
            }

            @Override
            public void setAuthenticationStatus(int i, String s) {
                Log.d(TAG, "setAuthenticationStatus()");
            }

            @Override
            public void setToken(String s, String s1) {
                Log.d(TAG, "setToken()");
            }

            @Override
            public void tokenRequestFailed(String s, String s1, String s2) {
                Log.d(TAG, "tokenRequestFailed()");
            }

            @Override
            public void selectedProvider(Mvpd mvpd) {
                Log.d(TAG, "selectedProvider()");
            }

            @Override
            public void displayProviderDialog(ArrayList<Mvpd> arrayList) {
                Log.d(TAG, "displayProviderDialog()");
            }

            @Override
            public void navigateToUrl(String s) {
                Log.d(TAG, "navigateToUrl()");
            }

            @Override
            public void sendTrackingData(Event event, ArrayList<String> arrayList) {
                Log.d(TAG, "sendTrackingData()");
            }

            @Override
            public void setMetadataStatus(MetadataKey metadataKey, MetadataStatus metadataStatus) {
                Log.d(TAG, "setMetadataStatus()");
            }

            @Override
            public void preauthorizedResources(ArrayList<String> arrayList) {
                Log.d(TAG, "preauthorizedResources()");
            }

            @Override
            public void status(AdvancedStatus advancedStatus) {
                Log.d(TAG, "status()");
            }
        });
    }
}
