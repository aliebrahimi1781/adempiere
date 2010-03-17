package org.eevolution.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import org.eevolution.service.ADTreeService;

@Aspect
public class Introductions {
@SuppressWarnings("unused")
@DeclareParents("ADTreeServiceImpl")
private ADTreeService ADTreeService;
}