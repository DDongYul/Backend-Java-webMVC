package core.mvc;

import core.mvc.view.ModelAndView;

import java.util.Map;

public class ForwardController extends AbstractController {

    private final String forwardUrl;

    public ForwardController(String forwardUrl) {
        this.forwardUrl = forwardUrl;
        if (forwardUrl == null) {
            throw new NullPointerException("forwardUrl is null. 이동할 URL을 입력하세요.");
        }
    }

    @Override
    public ModelAndView execute(Map<String, String> params) throws Exception {
        return jspView(forwardUrl);
    }
}