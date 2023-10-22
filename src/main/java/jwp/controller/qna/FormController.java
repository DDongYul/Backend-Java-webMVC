package jwp.controller.qna;

import core.mvc.AbstractController;
import core.mvc.view.ModelAndView;
import jwp.util.UserSessionUtils;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class FormController extends AbstractController {
    private HttpSession session;

    @Override
    public ModelAndView execute(Map<String, String> params) throws Exception {
        if (UserSessionUtils.isLogined(session)) {
            return jspView("/qna/form.jsp");
        }
        return jspView("redirect:/user/loginForm");
    }

    @Override
    public void setSession(HttpSession session) {
        super.setSession(session);
    }

}
