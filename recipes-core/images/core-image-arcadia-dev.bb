require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append="\
 \
  tools-debug \
  debug-tweaks"

IMAGE_INSTALL:append=" virtual/libgles1 virtual/libgles2 virtual/libgles3 pkgconfig packagegroup-arcadia-apps packagegroup-arcadia-tools "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

