package processor;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * Created by LFM on 2021/5/12.
 */
public class TheProcessor implements Processor {
    @Override
    public Set<String> getSupportedOptions() {
        System.out.println("~~" + getClass().getSimpleName() + ".getSupportedOptions~~");
        return Collections.singleton("Identifiers");
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        System.out.println("~~" + getClass().getSimpleName() + ".getSupportedAnnotationTypes~~");
        return Collections.singleton("mine.TheAnnotation");
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        System.out.println("~~" + getClass().getSimpleName() + ".getSupportedSourceVersion~~");
        return SourceVersion.RELEASE_11;
    }

    @Override
    public void init(ProcessingEnvironment processingEnv) {
        System.out.println("~~" + getClass().getSimpleName() + ".init~~");
        System.out.println("processingEnv = " + processingEnv);

        System.out.println("getElementUtils is " + processingEnv.getElementUtils());
        System.out.println("getFiler is " + processingEnv.getFiler());
        System.out.println("getLocale is " + processingEnv.getLocale());
        System.out.println("getMessager is " + processingEnv.getMessager());
        System.out.println("getOptions is " + processingEnv.getOptions());
        System.out.println("getSourceVersion is " + processingEnv.getSourceVersion());
        System.out.println("getTypeUtils is " + processingEnv.getTypeUtils());

    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("~~" + getClass().getSimpleName() + ".process~~");
        System.out.println("annotations = " + annotations + ", roundEnv = " + roundEnv);

        return false;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        System.out.println("~~" + getClass().getSimpleName() + ".getCompletions~~");
        System.out.println("element = " + element + ", annotation = " + annotation + ", member = " + member + ", userText = " + userText);
        return null;
    }
}
