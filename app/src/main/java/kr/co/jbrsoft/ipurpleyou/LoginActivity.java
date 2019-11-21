package kr.co.jbrsoft.ipurpleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

import static com.nhn.android.naverlogin.OAuthLogin.mOAuthLoginHandler;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        // 네이버 라이브러리 사용하기
//        OAuthLogin mOAuthLoginModule = OAuthLogin.getInstance();
//        mOAuthLoginModule.init( OAuthSampleActivity.this ,OAUTH_CLIENT_ID ,OAUTH_CLIENT_SECRET ,OAUTH_CLIENT_NAME);
//
//        // OAuthLoginButton 객체를 사용 시 반드시 네이버에서 제공하는 로그인 버튼 가이드를 따라야합니다.
//        mOAuthLoginButton = (OAuthLoginButton) findViewById(R.id.buttonOAuthLoginImg);
//        mOAuthLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);
//        mOAuthLoginButton.setBgResourceId(R.drawable.img_loginbtn_usercustom);
//
//    }
//
//    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
//        @Override
//        public void run(boolean success) {
//            if (success) {
//                String accessToken = mOAuthLoginModule.getAccessToken(mContext);
//                String refreshToken = mOAuthLoginModule.getRefreshToken(mContext);
//                long expiresAt = mOAuthLoginModule.getExpiresAt(mContext);
//                String tokenType = mOAuthLoginModule.getTokenType(mContext);
//                mOauthAT.setText(accessToken);
//                mOauthRT.setText(refreshToken);
//                mOauthExpires.setText(String.valueOf(expiresAt));
//                mOauthTokenType.setText(tokenType);
//                mOAuthState.setText(mOAuthLoginModule.getState(mContext).toString());
//            } else {
//                String errorCode = mOAuthLoginModule.getLastErrorCode(mContext).getCode();
//                String errorDesc = mOAuthLoginModule.getLastErrorDesc(mContext);
//                Toast.makeText(mContext, "errorCode:" + errorCode
//                        + ", errorDesc:" + errorDesc, Toast.LENGTH_SHORT).show();
//            }
//        };
//
//    };
//    mOAuthLoginModule.startOauthLoginActivity(mContext, mOAuthLoginHandler);
//}
    }
}
