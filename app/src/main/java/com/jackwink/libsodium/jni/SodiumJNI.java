/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jackwink.libsodium.jni;

public class SodiumJNI {
  public final static native int sodium_init();
  public final static native String sodium_version_string();
  public final static native int crypto_sign_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_open(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_detached(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_verify_detached(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4);
}