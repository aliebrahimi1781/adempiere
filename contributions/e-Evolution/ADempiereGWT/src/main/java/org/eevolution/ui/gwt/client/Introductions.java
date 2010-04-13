package org.eevolution.ui.gwt.client;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;


@Aspect
public class Introductions {
@SuppressWarnings("unused")
@DeclareParents("ADTreeServiceImpl")
private ADTreeService ADTreeService;
}