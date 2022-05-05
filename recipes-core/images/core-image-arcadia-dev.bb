SUMMARY = "Basic KMS/DRM/GBM graphics image"
LICENSE = "MIT"

inherit core-image-dev

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL} kmscube hello-rs glplay-rs "
IMAGE_ROOTFS_EXTRA_SPACE:qemux86-64 = "41943040"
IMAGE_INSTALL:append:qemux86-64=" \
  openssh \
  openssh-sftp \
  openssh-sftp-server \
  packagegroup-core-buildessential \
  clang \
  ninja \
  vim \
  git \
  curl \
  wget \
  htop \
  iftop \
  libtool \
  ldd \
  bash \
  coreutils \
  e2fsprogs \
  e2fsprogs-resize2fs \
  e2fsprogs-tune2fs \
  findutils \
  gawk \
  grep \
  less \
  net-tools \
  parted \
  pciutils \
  procps \
  sed \
  util-linux \
  which "
#IMAGE_FEATURES += "splash debug-tweaks tools-debug package-management ssh-server-dropbear hwcodecs"
IMAGE_FEATURES += " splash"
#DISTRO_FEATURES += " opengl wayland "

# Graphics and Audio
#REQUIRED_DISTRO_FEATURES = " opengl wayland "

#CORE_IMAGE_BASE_INSTALL += " wayland htop ldd "

KERNEL_FEATURES:append:qemuall=" cfg/virtio.scc features/drm-bochs/drm-bochs.scc"
KERNEL_FEATURES:append:qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES:append:qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"

#SDL Test Samples
#IMAGE_INSTALL:append = " sdltutorials"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

