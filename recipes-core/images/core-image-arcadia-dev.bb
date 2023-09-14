require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append=" \
  dbg-pkgs \
  src-pkgs \
  dev-pkgs \
  tools-debug \
  debug-tweaks "

IMAGE_INSTALL:append=" \
  packagegroup-arcadia-devtools"


IMAGE_INSTALL:append:qemuall=" libgles1-mesa-dev libgles2-mesa-dev libgles3-mesa-dev "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

