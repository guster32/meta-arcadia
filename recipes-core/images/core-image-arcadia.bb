SUMMARY = "Basic KMS/DRM/GBM graphics image"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES:append = " splash "

IMAGE_INSTALL:append=" \
  glplay \
  hello-rs \
  packagegroup-core-boot \
  packagegroup-arcadia-core \
  packagegroup-arcadia-emulators \
  packagegroup-arcadia-graphics \
  packagegroup-arcadia-networking"

IMAGE_INSTALL:remove = " busybox sysvinit "

#This line prevents the build from fDISTRO_FEATURESalling back to using SysVinit when systemd is not available
PREFERRED_PROVIDER_virtual/bootloader = ""
PREFERRED_PROVIDER_virtual/libintl = "glibc"
#This tells Yocto to use bash
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}bash ?= "bash"


# ODROID TWEAKS
IMAGE_INSTALL:remove:odroid-xu4 = " glplay "
IMAGE_INSTALL:remove:odroid-xu4 = " wlroots "
IMAGE_INSTALL:remove:odroid-xu4 = " mamedev "

# QEMU TWEAKS
IMAGE_INSTALL:append:qemuall=" mesa libgles1-mesa libgles2-mesa "
KERNEL_FEATURES:append:qemuall=" cfg/virtio.scc features/drm-bochs/drm-bochs.scc"
KERNEL_FEATURES:append:qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES:append:qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

