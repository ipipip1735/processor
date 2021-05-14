package processor;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by LFM on 2021/5/14.
 */
@SupportedAnnotationTypes("mine.TheAnnotation")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
@AutoService(Processor.class)
public class TheAbstractProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        System.out.println("TheAbstractProcessor.init");
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
        System.out.println("TheAbstractProcessor.process");
        System.out.println("annotations = " + annotations + ", roundEnv = " + roundEnv);
        return false;
    }
}
