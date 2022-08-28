require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append="\
  openssh \
  openssh-sftp \
  openssh-sftp-server \
  tools-debug \
  debug-tweaks"

IMAGE_INSTALL:append=" packagegroup-arcadia-apps packagegroup-arcadia-tools "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

